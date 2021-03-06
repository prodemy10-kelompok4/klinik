package com.empat.klinik.model.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;


public class PemesananDetailDto {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "antrian_generator")
    @SequenceGenerator(name = "antrian_generator", sequenceName = "seq_antrian", initialValue = 1, allocationSize = 1)
    private Integer noAntrian;
    private String nama;
    private Integer idPasien;
    private String namaIcdx;
    private String namaKaryawan;
    private String statusPelayanan;
    private String pekerjaan;

    public Integer getNoAntrian() {
        return noAntrian;
    }

    public void setNoAntrian(Integer noAntrian) {
        this.noAntrian = noAntrian;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getIdPasien() {
        return idPasien;
    }

    public void setIdPasien(Integer idPasien) {
        this.idPasien = idPasien;
    }

    public String getNamaIcdx() {
        return namaIcdx;
    }

    public void setNamaIcdx(String namaIcdx) {
        this.namaIcdx = namaIcdx;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getStatusPelayanan() {
        return statusPelayanan;
    }

    public void setStatusPelayanan(String statusPelayanan) {
        this.statusPelayanan = statusPelayanan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
}
