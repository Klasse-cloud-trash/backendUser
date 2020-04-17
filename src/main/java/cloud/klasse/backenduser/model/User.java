package cloud.klasse.backenduser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {

    @Id
    private String uuid;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String nickName;

    @Column(nullable = false, columnDefinition = "boolean")
    private boolean isActivated = false;

}

