/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.basic;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.basic.SOAPLogin.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Tue Mar 05 10:12:09 CST 2013")
public class SOAPLogin_ {
    public static volatile SingularAttribute<SOAPLogin,Boolean> allowRecording;
    public static volatile SingularAttribute<SOAPLogin,Boolean> allowSameURLMultipleTimes;
    public static volatile SingularAttribute<SOAPLogin,Boolean> becomemoderator;
    public static volatile SingularAttribute<SOAPLogin,String> clientURL;
    public static volatile SingularAttribute<SOAPLogin,Date> created;
    public static volatile SingularAttribute<SOAPLogin,String> hash;
    public static volatile SingularAttribute<SOAPLogin,String> landingZone;
    public static volatile SingularAttribute<SOAPLogin,Long> roomRecordingId;
    public static volatile SingularAttribute<SOAPLogin,Long> room_id;
    public static volatile SingularAttribute<SOAPLogin,String> sessionHash;
    public static volatile SingularAttribute<SOAPLogin,Boolean> showAudioVideoTest;
    public static volatile SingularAttribute<SOAPLogin,Boolean> showNickNameDialog;
    public static volatile SingularAttribute<SOAPLogin,Long> soapLoginId;
    public static volatile SingularAttribute<SOAPLogin,Date> useDate;
    public static volatile SingularAttribute<SOAPLogin,Boolean> used;
}