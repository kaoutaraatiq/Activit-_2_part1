package ma.emsi.jpaap.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
//@Entity pour qu'elle soit une entité jpa
@Data @NoArgsConstructor @AllArgsConstructor
//@Data pour les getters et setters
//@NoArgsConstructor constructeur sans arguments
//@AllArgsConstructor constructeur avec arguments
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)//changer la taille du nom
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private boolean malade;
    private int score;


}
