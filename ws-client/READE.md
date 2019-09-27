wsimport -d D:   -keep -verbose http://localhost:9001/Service/Function?wsdl 
simport -keep -d D:\temp\d -s D:\temp\s -p com.example.demo.ws.user -verbose http://localhost:8080/user?wsdl
-keep：是否生成java源文件

-d：指定.class文件的输出目录

-s：指定.java文件的输出目录

-p：定义生成类的包名，不定义的话有默认包名

-verbose：在控制台显示输出信息

-b：指定jaxws/jaxb绑定文件或额外的schemas

-extension：使用扩展来支持SOAP1.2
