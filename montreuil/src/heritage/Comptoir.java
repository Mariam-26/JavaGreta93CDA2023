package heritage;

import java.util.ArrayList;
import recipient.Recipient;

public class Comptoir {
  private Recipient bacThe, bacBiere;
  private ArrayList<Verre> verres;

  /**
   * Crée un comptoir sans verres.
   * <br>Requiert bacThe != null et bacBiere != null
   * <br>Garantit que getVerres() != null et a une taille 0
   * @param bacThe
   * @param bacBiere
   */
  public Comptoir(Recipient bacThe, Recipient bacBiere) {
    assert bacThe != null : "Le bac à thé nepeut être null";
    assert bacBiere != null : "Le bac à bière ne peut être null";
    this.bacThe = bacThe;
    this.bacBiere = bacBiere;
    this.verres = new ArrayList<Verre>();
  }

  public Recipient getBacThe() {
    return bacThe;
  }

  public Recipient getBacBiere() {
    return bacBiere;
  }

  /** Verres du comptoir. Jamais null. */
  public ArrayList<Verre> getVerres() {
    return verres;
  }

  /** Nombre de verres à thé, qu'ils soient vides ou pleins */
  public int getNbVerresAThe() {
    int result = 0;
    for (Verre verre : verres) {
      if (!verre.isABiere()) {
        result++;
      }
    }
    return result;
  }

  /** Nombre de verres à bière, qu'ils soient vides ou pleins */
  public int getNbVerresABiere() {
    int result = 0;
    for (Verre verre : verres) {
      if (verre.isABiere()) {
        result++;
      }
    }
    return result;
  }

  /**
   * Peut-on remplir tous les verres ?
   * C'est à dire y a-t-il assez dans le bac à bière
   * et dans le bac à thé pour remplir les verres
   * respectivement à bière et à thé ?
   * @return
   */
  public boolean peutRemplirTous() {
    int nbBieres = 0;
    int nbThes = 0;
    for (Verre verre : verres) {
      if (verre.estVide()) {
        if (verre.isABiere()) {
          nbBieres++;
        } else {
          nbThes++;
        }
      }
    }
    return bacThe.getQuantite() >= nbThes
      && bacBiere.getQuantite() >= nbBieres;
  }

  /** Remplit tous les verres du comptoir.
   * <br>Requiert peutRemplirTous()
   * <br>Garantit que tous les verres sont remplis (du
   * bon breuvage), et que les bacs sont diminués des verres
   * correpondants.
   */
  public void remplirTous() {
    assert peutRemplirTous() : "Impossible de remplir tous les verres";
    for (Verre verre : verres) {
      if (verre.isABiere()) {
        bacBiere.remplir(verre);
      } else {
        bacThe.remplir(verre);
      }
    }
  }
  

}