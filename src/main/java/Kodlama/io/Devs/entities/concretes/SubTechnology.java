package Kodlama.io.Devs.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "technologies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SubTechnology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private ProgrammingLanguage language;

}
