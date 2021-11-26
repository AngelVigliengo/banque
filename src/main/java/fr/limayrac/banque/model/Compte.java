package fr.limayrac.banque.model;

public class Compte {
    private String id;
    private String nom;
    private String solde;
    private String description;

    public Compte()
    {
        super();
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getSolde() {
        return solde;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSolde(String solde) {
        this.solde = solde;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", solde='" + solde + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
