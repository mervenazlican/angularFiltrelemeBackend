package com.example.SorgulamaEkrani.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SorgulamaEkrani")
public class Filtreleme {
	
	@Id
	@GeneratedValue
	@Column(name = "proje_id")
	private int projeId;
	@Column(name = "proje_adi")
	private String projeAdi;
	@Column(name = "proje_konusu")
	private String projeKonusu;
	@Column(name = "baslangic_tarihi")
	private Date baslangicTarihi;
	@Column(name = "bitis_tarihi")
	private Date bitisTarihi;
	@Column(name = "proje_yoneticisi")
	private String projeYoneticisi;
	@Column(name = "proje_durumu")
	private boolean projeDurumu;

	public Filtreleme() {

	}

	public Filtreleme(String projeAdi, String projeKonusu, Date baslangicTarihi, Date bitisTarihi,
			String projeYoneticisi, boolean projeDurumu) {
		this.projeAdi = projeAdi;
		this.projeKonusu = projeKonusu;
		this.baslangicTarihi = baslangicTarihi;
		this.bitisTarihi = bitisTarihi;
		this.projeYoneticisi = projeYoneticisi;
		this.projeDurumu = projeDurumu;
	}

	public int getProjeId() {
		return projeId;
	}

	public void setProjeId(int projeId) {
		this.projeId = projeId;
	}

	public String getProjeAdi() {
		return projeAdi;
	}

	public void setProjeAdi(String projeAdi) {
		this.projeAdi = projeAdi;
	}

	public String getProjeKonusu() {
		return projeKonusu;
	}

	public void setProjeKonusu(String projeKonusu) {
		this.projeKonusu = projeKonusu;
	}

	public Date getBaslangicTarihi() {
		return baslangicTarihi;
	}

	public void setBaslangicTarihi(Date baslangicTarihi) {
		this.baslangicTarihi = baslangicTarihi;
	}

	public Date getBitisTarihi() {
		return bitisTarihi;
	}

	public void setBitisTarihi(Date bitisTarihi) {
		this.bitisTarihi = bitisTarihi;
	}

	public String getProjeYoneticisi() {
		return projeYoneticisi;
	}

	public void setProjeYoneticisi(String projeYoneticisi) {
		this.projeYoneticisi = projeYoneticisi;
	}

	public boolean isProjeDurumu() {
		return projeDurumu;
	}

	public void setProjeDurumu(boolean projeDurumu) {
		this.projeDurumu = projeDurumu;
	}

}
