package model;

public class Client {
    private String nomClient;
    private String prenomClient;
    private String portableClient;
    private String passwordClient;

    public Client(String nomClient, String prenomClient, String portableClient, String passwordClient) {
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.portableClient = portableClient;
        this.passwordClient = passwordClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getPortableClient() {
        return portableClient;
    }

    public void setPortableClient(String portableClient) {
        this.portableClient = portableClient;
    }

    public String getPasswordClient() {
        return passwordClient;
    }

    public void setPasswordClient(String passwordClient) {
        this.passwordClient = passwordClient;
    }

}
