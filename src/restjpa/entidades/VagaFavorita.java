/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restjpa.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author administrator
 */
@Entity
public class VagaFavorita implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }
    
    private double distanciaInteressadoVaga;
    
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VagaFavorita)) {
            return false;
        }
        VagaFavorita other = (VagaFavorita) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restjpa.entidades.VagaFavorita[ id=" + id + " ]";
    }

    /**
     * @return the distanciaInteressadoVaga
     */
    public double getDistanciaInteressadoVaga() {
        return distanciaInteressadoVaga;
    }

    /**
     * @param distanciaInteressadoVaga the distanciaInteressadoVaga to set
     */
    public void setDistanciaInteressadoVaga(double distanciaInteressadoVaga) {
        this.distanciaInteressadoVaga = distanciaInteressadoVaga;
    }
    
}
