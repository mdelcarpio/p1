/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restjpa.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Michelet
 */
@Entity
public class Vaga implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String custo;
    
    private String bairro;
    
    private String endereco;
    
    private String universidade;
    
    private String latitude;
    
    private String longitude;
    
    private String distanciaUniversidadeVaga;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataCadastro;
    
    private boolean ativo;

    
    @ManyToOne(cascade = CascadeType.ALL)
    private Contato contato;
    public Contato getContato(){
        return contato;
    }
    public void setContato (Contato contato){
        this.contato = contato;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vaga)) {
            return false;
        }
        Vaga other = (Vaga) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restjpa.Vaga[ id=" + getId() + " ]";
    }

    /**
     * @return the custo
     */
    public String getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(String custo) {
        this.custo = custo;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the dataCadastro
     */
    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param dataCadastro the dataCadastro to set
     */
    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * @return the universidade
     */
    public String getUniversidade() {
        return universidade;
    }

    /**
     * @param universidade the universidade to set
     */
    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    /**
     * @return the latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the distanciaUniversidadeVaga
     */
    public String getDistanciaUniversidadeVaga() {
        return distanciaUniversidadeVaga;
    }

    /**
     * @param distanciaUniversidadeVaga the distanciaUniversidadeVaga to set
     */
    public void setDistanciaUniversidadeVaga(String distanciaUniversidadeVaga) {
        this.distanciaUniversidadeVaga = distanciaUniversidadeVaga;
    }

   
 
    
}
