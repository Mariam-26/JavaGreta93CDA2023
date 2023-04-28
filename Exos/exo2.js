while (!tasEstVide()) { 
  if (!brouetteEstPleine()) {
    mettrePelletee();
  }
  if (brouetteEstPleine || tasEstVide) {
    allerVider();
  }
}

// AUTREMENT

while (!tasEstVide) {
  while (!tasVide && !brouetteEstPleine) {
      mettrePelletee();
  }
  transporter();
}
  

package recipient;


/**
 * tas1, brouette, tas2
 * 
 * tas1EstVide -> tas1.estVide
 * brouettePleine -> brouette.estVide
 * mettrePelletee -> tas1.mettreUnDans(brouette)
 * allerVide() -> brouette.viderDans(tas2)
 */
public class TasSable {
	
public void tasEstVide() {
	
	Recipient tas1, brouette, tas2;
	
	while (!tas1.estVide()) { 
		  if (!brouette.estPlein()) {
		    brouette.mettrePelletee(brouette);
		  }
		  if (brouette.brouetteEstPleine || brouette.tasEstVide) {
		    brouette.allerVider();
		  }
		}
}

}


/**
	 * tas, panier, marmite
	 * 
	 * panierEstVide -> panier.estVide
	 * marmiteEstPleine -> marmite.estPlein
	 * 
	 * mettreDansMarmite -> panier.mettreUnDans(marmite)
	 * remplirPanier -> tas.remplir(panier)
	 */
public class Patates {
  Recipient tas, panier, marmite;

  public void marmiteEstpleine() {
    while (!panier.estVide()) {
      if (tas.remplir(panier)) {
        panier.mettreUnDans(marmite);

      }
      if (panier.estPlein() || tas.estVide()) {
        panier.mettreUnDans(marmite);
      }

    }

  }

}
