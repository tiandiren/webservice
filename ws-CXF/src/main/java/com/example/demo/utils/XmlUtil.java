package com.example.demo.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.*;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

@Deprecated
public class XmlUtil {

    public static String toXML(Object obj) {
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());

            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");// //编码格式
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);// 是否格式化生成的xml串
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);// 是否省略xm头声明信息

            marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new NamespacePrefixMapper() {
                @Override
                public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
                    if (namespaceUri.equals("http://localhost:8080/YQT/BUY")) return "yqt";
                    return suggestion;
                }
            });

            StringWriter writer = new StringWriter();
            marshaller.marshal(obj, writer);
            return writer.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T fromXML(String xml, Class<T> valueType) {
        try {
            JAXBContext context = JAXBContext.newInstance(valueType);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (T) unmarshaller.unmarshal(new StringReader(xml));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
		File f = new File("conf/test.xml");
		BufferedReader br = new BufferedReader(new FileReader(f));
		StringBuffer sb = new StringBuffer();
		String line = "";
		while((line = br.readLine()) != null){
			sb.append(line);
		}
		XmlUtil xu = new XmlUtil();
		String aa = xu.toXML(sb.toString());
		
		System.out.println(aa);
	}
}
