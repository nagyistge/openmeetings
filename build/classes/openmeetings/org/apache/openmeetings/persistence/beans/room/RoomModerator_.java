/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.room;

import java.lang.Boolean;
import java.lang.Long;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import org.apache.openmeetings.persistence.beans.user.User;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.room.RoomModerator.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Tue Mar 05 10:12:10 CST 2013")
public class RoomModerator_ {
    public static volatile SingularAttribute<RoomModerator,Boolean> deleted;
    public static volatile SingularAttribute<RoomModerator,Boolean> isSuperModerator;
    public static volatile SingularAttribute<RoomModerator,Long> roomId;
    public static volatile SingularAttribute<RoomModerator,Long> roomModeratorsId;
    public static volatile SingularAttribute<RoomModerator,Date> starttime;
    public static volatile SingularAttribute<RoomModerator,Date> updatetime;
    public static volatile SingularAttribute<RoomModerator,User> user;
}