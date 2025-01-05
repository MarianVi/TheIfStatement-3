Realizează un modul simplu pentru un bancomat, care să asiste utilizatorul în efectuarea unei operațiuni de eliberare numerar. Se vor implementa următoarele etape:

    1. Verificarea codului PIN: Se citește 1 număr de la tastatură reprezentând pinClient - codul PIN introdus\
      de client și se compară cu un număr stocat intern (i.e. într-o variabilă) de aplicație pinCorect - codul PIN\
      real al cardului.\
      În cazul în care cele două numere coincid, se va afișa mesajul PIN corect și se va trece la etapa următoare.\
      Altfel, bancomatul va afișa mesajul PIN gresit și se va termina.
    2. Verificarea sumei cerute: În cazul în care PIN-ul introdus este corect, se va trece la etapa următoare.\
      În cadrul acesteia, se citește de la tastatură 1 număr întreg, suma, ce reprezintă suma pe care clientul\
      dorește să o scoată de la bancomat. În cadrul algoritmului trebuie să existe și soldCont, ce reprezintă\
      suma totală pe care clientul o are în cont. Aceasta poate fi stocată intern (i.e. într-o variabilă).\
      Programul va afișa mesajul Tranzactie in curs de procesare dacă suma dorită nu depășește fondurile\
      și apoi se trece la pasul următor. În caz contrar, programul va afișa mesajul „Fonduri insuficiente\
      pentru realizarea tranzactiei“ și apoi se va termina.
    3. Afișarea sumei rămase: Dacă operațiunea s-a realizat cu succes, utilizatorul este întrebat dacă dorește\
    afișarea sumei de bani rămase în cont: Doriti afisarea noii balante a contului curent? Raspundeti cu 0 (NU)\
    sau 1 (DA). În caz afirmativ, se va afișa un mesaj relevant cu noua valoare. Altfel, programul va afișa\
    un mesaj de rămas bun (ex: Multumim pentru ca ati ales Banca DevBank) și se va termina.
    4. Introducerea unui cod PIN mai lung de 4 cifre.
    5. Folosirea valorii suma de 0 RON.
    6. Restricționarea sumei de extras la o valoare multiplu de 10.
    7. Introducerea unei alte cifre (i.e. diferite de 0 sau 1) la ultimul pas.
