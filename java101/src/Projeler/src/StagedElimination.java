/*1000 kişilik bir grubun içinden nihai olarak %3 kişi seçimi yapılacaktır. Birinci aşamada tüm kişi grubunun içinden 100 kişi seçilmiştir.
İlk durumdaki 1000 kişi arasından %3 seçilebilmesi için birinci aşamada seçilen 100 kişilik grubun % kaçı elenmelidir?
Yukarıdaki problem de 1000 kişi (CandidateNumber), %3 (finalPercent) ve 100 kişi (firstSelection) değerlerini kullanıcıdan alıp sonucu bulan programı yazınız. */

import java.util.Scanner;

public class StagedElimination {
    public static void main(String[] args) {
        int candidateNumber, finalPercent, firstSelection, finalElimination;
        double finalEliminationPercent;
        Scanner inp = new Scanner(System.in);

        System.out.println("Katılımcı sayısını giriniz: ");
        candidateNumber = inp.nextInt();
        System.out.println("Eleme yüzdesini giriniz: ");
        finalPercent = inp.nextInt();
        System.out.println("İlk elemede seçilecek kişi sayısını giriniz: ");
        firstSelection = inp.nextInt();

        finalElimination = firstSelection - ( Math.round(candidateNumber * finalPercent / 100));
        finalEliminationPercent = (finalElimination * 100) / firstSelection;
        System.out.println(finalEliminationPercent + "%");
    }
}
