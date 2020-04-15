package net.elmajouli.hostpital.enteties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
@Entity@Data@AllArgsConstructor@NoArgsConstructor@ToString
public class Patient {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date birth;
    private Boolean isSick;
}
