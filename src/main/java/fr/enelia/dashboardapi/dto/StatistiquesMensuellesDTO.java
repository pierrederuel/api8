package fr.enelia.dashboardapi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class StatistiquesMensuellesDTO {
    private double[] stats;
    private double caTotal;
    private double caReel;
    private int nbVentes;
    private int nbAssises;
    private int nbAnnulationClient;
    private int ecoHabitant;
    private int visiteTechnique;
    private int nbFinancement;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateDebut;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateFin;

    public double[] getStats() {
        return stats;
    }

    public void setStats(double[] stats) {
        this.stats = stats;
    }

    public double getCaTotal() {
        return caTotal;
    }

    public void setCaTotal(double caTotal) {
        this.caTotal = caTotal;
    }

    public double getCaReel() {
        return caReel;
    }

    public void setCaReel(double caReel) {
        this.caReel = caReel;
    }

    public int getNbVentes() {
        return nbVentes;
    }

    public void setNbVentes(int nbVentes) {
        this.nbVentes = nbVentes;
    }

    public int getNbAssises() {
        return nbAssises;
    }

    public void setNbAssises(int nbAssises) {
        this.nbAssises = nbAssises;
    }

    public int getNbAnnulationClient() {
        return nbAnnulationClient;
    }

    public void setNbAnnulationClient(int nbAnnulationClient) {
        this.nbAnnulationClient = nbAnnulationClient;
    }

    public int getEcoHabitant() {
        return ecoHabitant;
    }

    public void setEcoHabitant(int ecoHabitant) {
        this.ecoHabitant = ecoHabitant;
    }

    public int getVisiteTechnique() {
        return visiteTechnique;
    }

    public void setVisiteTechnique(int visiteTechnique) {
        this.visiteTechnique = visiteTechnique;
    }

    public int getNbFinancement() {
        return nbFinancement;
    }

    public void setNbFinancement(int nbFinancement) {
        this.nbFinancement = nbFinancement;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }
}
