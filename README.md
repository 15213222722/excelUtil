#ExcelUtil

ExcelUtil借助反射和POI对Excel读取,省略了以往读取Excel的繁琐步骤,调用ExcelUtil只需要2步,对,你没有看错,2步足以读取到Excel的内容.兼容03/07版Excel.
```
<!-- 引入ExcelUtil -->
<dependency>
    <groupId>net.oschina.likaixuan</groupId>
    <artifactId>excelutil</artifactId>
    <version>1.0</version>
</dependency>
```
```
调用步骤:   
1.定义需要读取的表头字段和表头对应的属性字段 
String keyValue ="手机名称:phoneName,颜色:color,售价:price";  
2.读取数据 
List<Object> list =  ExcelUtil.readXls("C://test.xlsx",ExcelUtil.getMap(keyValue),"com.lkx.model.PhoneModel");
```