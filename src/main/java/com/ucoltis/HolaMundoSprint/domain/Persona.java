package com.ucoltis.HolaMundoSprint.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="persona")
public class Persona implements Serializable{
        
        private static final long serialVersionUID=1L;
        @Id
          @GeneratedValue(strategy = GenerationType.IDENTITY)
         private Long idPersona;
        private String nombre ;
        private String apellido  ;
        private String email ;
        private String telefono ;
}
