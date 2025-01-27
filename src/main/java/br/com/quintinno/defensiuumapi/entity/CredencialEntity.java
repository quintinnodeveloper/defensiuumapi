package br.com.quintinno.defensiuumapi.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_credencial")
public class CredencialEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo", nullable = false)
    private Integer codigo;

    @ManyToOne
    @JoinColumn(name = "id_categoria_credencial")
    private CategoriaCredencialEntity categoriaCredencialEntity;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private PessoaEntity pessoaEntity;

    @Column(name = "identificador", length = 200, unique = true, nullable = false)
    private String identificador;

    @Column(name = "senha", length = 100, nullable = false)
    private String senha;

    @Column(name = "url", length = 255)
    private String url;

    @Column(name = "descricaoSistema", length = 100)
    private String descricaoSistema;

    @Column(name = "dataCriacao", nullable = false)
    private LocalDate dataCriacao;

    @Column(name = "data-atualizacao")
    private LocalDate dataAtualizacao;

    @Column(name = "ativo", nullable = false)
    private Boolean eAtivo;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public CategoriaCredencialEntity getCategoriaCredencialEntity() {
        return categoriaCredencialEntity;
    }

    public void setCategoriaCredencialEntity(CategoriaCredencialEntity categoriaCredencialEntity) {
        this.categoriaCredencialEntity = categoriaCredencialEntity;
    }

    public PessoaEntity getPessoaEntity() {
        return pessoaEntity;
    }

    public void setPessoaEntity(PessoaEntity pessoaEntity) {
        this.pessoaEntity = pessoaEntity;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescricaoSistema() {
        return descricaoSistema;
    }

    public void setDescricaoSistema(String descricaoSistema) {
        this.descricaoSistema = descricaoSistema;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Boolean geteAtivo() {
        return eAtivo;
    }

    public void seteAtivo(Boolean eAtivo) {
        this.eAtivo = eAtivo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CredencialEntity other = (CredencialEntity) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

}
