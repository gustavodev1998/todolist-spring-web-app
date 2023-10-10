package br.com.gustavocampos.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
/* Constrói os getters e setters */
import lombok.Data;

@Data
@Entity(name = "tb_users") /* Para a BD */
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID") /* Realiza a geração sozinho */
    private UUID id;

    /* @Column(name = "usuario") Caso queira o nome diferente na BD e na classe */
    @Column(unique = true) /* Na BD será uma coluna com constraint em que é atributo único */
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
