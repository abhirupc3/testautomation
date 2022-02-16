package misc;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import misc.helper.SampleBean;

public class JaxBMarshallerUnMarshellerExample {

	public static void main(String[] args) {
try{
		JAXBContext context = JAXBContext.newInstance(SampleBean.class);
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><sampleBean><password>abh</password><userName>cis</userName></sampleBean>";
		// Marshalling Ex. bean to xml
		SampleBean sb =new SampleBean();
		sb.setPassword("abhirup123");
		sb.setUserName("abhirup");
		Marshaller m = context.createMarshaller();
		ByteArrayOutputStream sos = new ByteArrayOutputStream();
		m.marshal(sb, sos);
		System.out.println(sos.toString());
		// UnMarshall Ex. xml to Bean
		StringReader reader = new StringReader(xml);
		Unmarshaller u = context.createUnmarshaller();
		SampleBean b = (SampleBean)u.unmarshal(reader);
		System.out.println(b.getPassword());
		System.out.println(b.getUserName());
}catch(Exception e){e.printStackTrace();}
	}

}
