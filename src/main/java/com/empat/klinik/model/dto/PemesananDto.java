package com.empat.klinik.model.dto;

public class PemesananDto {
    private Integer noAntrian;
    private Integer idPemesanan;
    private Integer idPasien;
    private String kdIcdx;
    private Long nik;
    //private String idKaryawan;
    private String statusPelayanan;
    //private String namaPasien;

    public Integer getNoAntrian() {
        return noAntrian;
    }

    public void setNoAntrian(Integer noAntrian) {
        this.noAntrian = noAntrian;
    }

    public Integer getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(Integer idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public Integer getIdPasien() {
        return idPasien;
    }

    public void setIdPasien(Integer idPasien) {
        this.idPasien = idPasien;
    }

    public String getKdIcdx() {
        return kdIcdx;
    }

    public void setKdIcdx(String kdIcdx) {
        this.kdIcdx = kdIcdx;
    }

    public Long getNik() {
        return nik;
    }

    public void setNik(Long nik) {
        this.nik = nik;
    }

    public String getStatusPelayanan() {
        return statusPelayanan;
    }

    public void setStatusPelayanan(String statusPelayanan) {
        this.statusPelayanan = statusPelayanan;
    }
}
