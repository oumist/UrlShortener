package urlshortener.domain;

import java.net.URI;
import java.sql.Date;

public class ShortURL {

  private String hash;
  private String target;
  private URI uri;
  private String sponsor;
  private Date created;
  private String owner;
  private Integer mode;
  private Boolean safe;
  private String ip;
  private String country;
  private byte[] qr;

  public ShortURL(String hash, String target, URI uri, String sponsor,
                  Date created, String owner, Integer mode, Boolean safe, String ip,
                  String country) {
    this.hash = hash;
    this.target = target;
    this.uri = uri;
    this.sponsor = sponsor;
    this.created = created;
    this.owner = owner;
    this.mode = mode;
    this.safe = safe;
    this.ip = ip;
    this.country = country;
  }

  public ShortURL() {
  }

  public String getHash() {
    return hash;
  }

  public String getTarget() {
    return target;
  }

  public URI getUri() {
    return uri;
  }

  public Date getCreated() {
    return created;
  }

  public String getOwner() {
    return owner;
  }

  public Integer getMode() {
    return mode;
  }

  public String getSponsor() {
    return sponsor;
  }

  public Boolean getSafe() {
    return safe;
  }

  public String getIP() {
    return ip;
  }

  public String getCountry() {
    return country;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public void setUri(java.net.URI uri) {
    this.uri = uri;
  }

  public void setSponsor(String sponsor) {
    this.sponsor = sponsor;
  }

  public void setCreated(java.sql.Date created) {
    this.created = created;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }

  public void setSafe(Boolean safe) {
    this.safe = safe;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public byte[] getQR() {
    return qr;
  }

  public void setQR(byte[] qr) {
    this.qr = qr;
  }
}
