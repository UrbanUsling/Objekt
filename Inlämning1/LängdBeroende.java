package Inlämning1;
abstract class LängdBeroende implements Växt{//abstrakt klass som implementerar växt
    abstract void setVattenmängd(double längd);
    /*vissa växters vattenmängd är beroende av längden. Dock skiljer sig formler åt. Hade det
    varit många växttyper hade det varit relevant att skriva en generell formel här y=kx+m */
}
