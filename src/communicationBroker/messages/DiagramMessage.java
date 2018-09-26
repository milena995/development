
package communicationBroker.messages;
import enumerations.RuntimeClassEnum;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Korisnik
 */
public class DiagramMessage implements Serializable {
    private String messageType;
    private Object bussinesObjectFigure;
    private RuntimeClassEnum objectType;
    
    public DiagramMessage(){}

   
    public byte[] serializeMessage() throws IOException{
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        ObjectOutputStream o = new ObjectOutputStream(b);
        o.writeObject(this);
        
        return b.toByteArray();
    }
    
    public static DiagramMessage deserializeMessage(byte[] bytes) throws IOException, ClassNotFoundException{
        ByteArrayInputStream b = new ByteArrayInputStream(bytes);
        ObjectInputStream o = new ObjectInputStream(b);
        return (DiagramMessage) o.readObject();
    } 

    /**
     * @return the messageType
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * @param messageType the messageType to set
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * @return the bussinesObjectFigure
     */
    public Object getBussinesObjectFigure() {
        return bussinesObjectFigure;
    }

    /**
     * @param bussinesObjectFigure the bussinesObjectFigure to set
     */
    public void setBussinesObjectFigure(Object bussinesObjectFigure) {
        this.bussinesObjectFigure = bussinesObjectFigure;
    }

    /**
     * @return the objectType
     */
    public RuntimeClassEnum getObjectType() {
        return objectType;
    }

    /**
     * @param objectType the objectType to set
     */
    public void setObjectType(RuntimeClassEnum objectType) {
        this.objectType = objectType;
    }
    
}
