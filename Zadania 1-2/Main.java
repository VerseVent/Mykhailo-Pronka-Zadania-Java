package com.company;

public class Main {
    //zad. 1,2 wyjatki i finally

        public static void main (String[] args)   {
            try {
                //tutaj musi być kod w jakim mosie być wyjątek
            }catch (Exception e){
                /*w java najwyższe klasy wyjatków -> EXCEPTION i ERROR one obsługują wszystkie
                 *mozliwe wyjątki
                 * oczywiszcie jest możliwość napisać wszystkie wyjątki z zadania, ale już po trzecim wątku nie będzie działać
                 */
            }catch (Error error){

            }finally {
                /* finally trzeba wykorzystyważ żeby co zrobić, jeżeli będzie jakiś wyjątek
                 * najczesczej wykorzystujemy żeby zamknąć jakiegoś scanera lub odczyt z pliku ...
                 *  ten blok będzie dzialać w jakim-kolwiek przypadku jeżeli wystąpi wyjątek
                 */
            }
        }
    }
