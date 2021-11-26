package fr.limayrac.banque.model;

public class Client {
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String profession;
    private String email;
    private String motDepasse;
    private String sexe;
    private boolean celibataire;
    private String remarques;

    public Client(){
        super();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getProfession() {
        return profession;
    }

    public String getEmail() {
        return email;
    }

    public String getMotDepasse() {
        return motDepasse;
    }

    public String getSexe() {
        return sexe;
    }

    public boolean isCelibataire() {
        return celibataire;
    }

    public String getRemarques() {
        return remarques;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMotDepasse(String motDepasse) {
        this.motDepasse = motDepasse;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setCelibataire(boolean celibataire) {
        this.celibataire = celibataire;
    }

    public void setRemarques(String remarques) {
        this.remarques = remarques;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", profession='" + profession + '\'' +
                ", email='" + email + '\'' +
                ", motDepasse='" + motDepasse + '\'' +
                ", sexe='" + sexe + '\'' +
                ", celibataire=" + celibataire +
                ", remarques='" + remarques + '\'' +
                '}';
    }
}
