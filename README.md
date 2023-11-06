# saga-choreography-ulima


## Imagen referencial


![img.png](img.png)

Fuente: [Fuente de la imagen/microservicios](https://microservices.io/patterns/data/saga.html)

## request
```bash
{
  "userId": 105,
  "productId": 3276,
  "amount": 300
}
```
### Happy scenario
```bash
{"eventId":"c765a17b-d9b4-429f-80cd-6d5520ced490","eventDate":"2023-11-06T20:33:31.042+00:00","orderRequestDto":{"userId":105,"productId":3276,"amount":300,"orderId":4},"orderStatus":"ORDER_CREATED","date":"2023-11-06T20:33:31.042+00:00"}
```

```bash
{"eventId":"25c51749-21cb-42d5-9776-31f4ba1a6646","eventDate":"2023-11-06T20:33:24.063+00:00","paymentRequestDto":{"orderId":3,"userId":105,"amount":300},"paymentStatus":"PAYMENT_COMPLETED","date":"2023-11-06T20:33:24.063+00:00"}
```

## request
```bash
{
  "userId": 105,
  "productId": 3276,
  "amount": 300
}
```

### Bad scenario
```bash
{"eventId":"c85a42b9-cc08-4d27-a4a0-0a6a3794d333","eventDate":"2023-11-06T20:33:31.050+00:00","orderRequestDto":{"userId":105,"productId":3276,"amount":300,"orderId":4},"orderStatus":"ORDER_CANCELLED","date":"2023-11-06T20:33:31.050+00:00"}
```

```bash
{"eventId":"2a8c8acd-80d2-4665-81da-bdc79a8a8f2f","eventDate":"2023-11-06T20:33:31.046+00:00","paymentRequestDto":{"orderId":4,"userId":105,"amount":300},"paymentStatus":"PAYMENT_FAILED","date":"2023-11-06T20:33:31.046+00:00"}
```

## Get Response

```bash
[
    {
        "id": 1,
        "userId": 105,
        "productId": 3276,
        "price": 300,
        "orderStatus": "ORDER_COMPLETED",
        "paymentStatus": "PAYMENT_COMPLETED"
    },
    {
        "id": 2,
        "userId": 105,
        "productId": 3276,
        "price": 300,
        "orderStatus": "ORDER_COMPLETED",
        "paymentStatus": "PAYMENT_COMPLETED"
    },
    {
        "id": 3,
        "userId": 105,
        "productId": 3276,
        "price": 300,
        "orderStatus": "ORDER_COMPLETED",
        "paymentStatus": "PAYMENT_COMPLETED"
    },
    {
        "id": 4,
        "userId": 105,
        "productId": 3276,
        "price": 300,
        "orderStatus": "ORDER_CANCELLED",
        "paymentStatus": "PAYMENT_FAILED"
    }
]
```
