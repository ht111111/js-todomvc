<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>商品列表</title>
</head>
<body>
商品列表
<#list goodsList as item>
    ${item.name}--${item.price}--${item.pic}
</#list>
</body>
</html>
