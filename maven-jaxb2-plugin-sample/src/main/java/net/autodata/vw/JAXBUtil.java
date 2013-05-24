package net.autodata.vw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import net.autodata.vw.model.GetEntryResponse;
import net.autodata.vw.model.ModelType;
import net.autodata.vw.model.VehicleType;

public class JAXBUtil {
    
    public static void main(String[] args) throws JAXBException, DatatypeConfigurationException, IOException{
        GetEntryResponse response = new GetEntryResponse();
        VehicleType vt = new VehicleType();
        ModelType mt = new ModelType();

        Calendar cal = Calendar.getInstance();
        DatatypeFactory dtf = DatatypeFactory.newInstance();
        XMLGregorianCalendar xgc = dtf.newXMLGregorianCalendar();
        xgc.setYear(cal.get(Calendar.YEAR));
        
        //Set Sub Types
        response.setVehicle(vt);
        vt.setModel(mt);
        mt.setModelYear(xgc);
        //marshal(response, new File("C:\\entry.xml"));
        GetEntryResponse entry = unmarshal(new File("C:\\entry.xml"));
    }

    // Export
    public static void marshal(GetEntryResponse response, File selectedFile)
            throws IOException, JAXBException {
        JAXBContext context;
        BufferedWriter writer = null;
        writer = new BufferedWriter(new FileWriter(selectedFile));
        context = JAXBContext.newInstance(GetEntryResponse.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(response, writer);
        //m.marshal(response, System.out);
        writer.close();
    }
 
    // Import
    public static GetEntryResponse unmarshal(File importFile) throws JAXBException {
        GetEntryResponse response = new GetEntryResponse();
 
        JAXBContext context = JAXBContext.newInstance(GetEntryResponse.class);
        Unmarshaller um = context.createUnmarshaller();
        response = (GetEntryResponse) um.unmarshal(importFile);
 
        return response;
    }    
}
