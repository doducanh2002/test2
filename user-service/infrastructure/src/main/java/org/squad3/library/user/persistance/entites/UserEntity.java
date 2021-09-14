package org.squad3.library.user.persistance.entites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

    @Entity
    @Table(name = "user")
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public class UserEntity implements Serializable {

        private static final Long serialVersionUID = 23423424243L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;

        @Column(name = "name")
        private String name;

        @Column(name = "gmail")
        private String gmail;

        @Column(name="phone")
        private int phone;

        @CreationTimestamp
        @Column(name = "created_date")
        private Instant createdDate;

        @UpdateTimestamp
        @Column(name = "updated_date")
        private Instant updatedDate;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof UserEntity)) return false;
            UserEntity that = (UserEntity) o;
            return Objects.equals(getId(), that.getId());
        }

        @Override
        public int hashCode() {
            return 31;
        }
    }
