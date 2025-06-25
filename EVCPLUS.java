import java.util.Scanner;
public class EVCPLUS {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter code");
        String code=input.next();

        if (code.equals("*770#")) {
            System.out.println("Enter pin");
            int pin = input.nextInt();

            if (pin == 1234) {
                    System.out.println("dooro 1 ilaa 8 EVC plus");
                    System.out.println("1. itus haraagaga ");
                    System.out.println("2. kaarka ku hadalka");
                    System.out.println("3. bxi biil");
                    System.out.println("4. uwareeji EVC Plus ");
                    System.out.println("5. warbxin kooban");
                    System.out.println("6. salaam bank");
                    System.out.println("7. Maaeynta");
                    System.out.println("8. Bill payment");
                    System.out.print("Dooro mid ka mid ah (1-8): ");
                    double doorasho = input.nextDouble();


                    if (doorasho == 1) {
                        System.out.println("Balance-kaaga waa: $2000");
                        //qeybtan waa kaarka ku hadalka
                    } else if (doorasho == 2) {
                        System.out.println("1. ku shubo airtima");
                        System.out.println("2.ugu shub airtima");
                        System.out.println("3.mifi packages");
                        System.out.println("4.ku shub intarnet");
                        System.out.println("5.ugu shub qof kle(MMT) ");
                        int dooro = input.nextInt();

                        if (dooro == 1) {
                            System.out.println("fadlan gali lacagta");
                            int lacagta = input.nextInt();
                            System.out.println("mahubtaa in aad ugu shubtay undifined $" + lacagta + " ");
                            System.out.println("1.haa");
                            System.out.println("2.maya");
                            int dooro2 = input.nextInt();

                            if (dooro2 == 1) {
                                System.out.println("wad ku guulesatay in aad ugu shubtid$" + lacagta + " ");

                            } else {
                                System.out.println("Mahadsanid ");
                            }
                        } else if (dooro == 2) {
                            System.out.println("fadlan gali mobil-ka");
                            int mobile = input.nextInt();
                            System.out.println("fadlan gali lacagta");
                            int lacagta = input.nextInt();
                            System.out.println("mahubtaa in aad ugu shubtid $" + lacagta + "?");
                            System.out.println("1.haa");
                            System.out.println("2.maya");
                            int dooro3 = input.nextInt();
                            if (dooro3 == 1) {
                                System.out.println("wad ku guulesatay in aad ugu shubtid$" + lacagta + " ");

                            } else {
                                System.out.println("Mahadsanid ");
                            }

                        } else if (dooro == 4) {
                            System.out.println("fadlan dooro numberka ku shubeso");
                            System.out.println("1.isbuucle(Weekly)");
                            System.out.println("2.TIME BASED PACKAGES");
                            System.out.println("3.DATE");
                            System.out.println("4.maalinle(Daily)");
                            System.out.println("5.Bille(MIFI)");
                            int dooro5=input.nextInt();

                            if (dooro5==1) {
                                System.out.println("Fadlan gali lacagta");
                                int lacagt2=input.nextInt();
                                System.out.println("ma hubtaa in aad ugu shubtid$" + lacagt2 + "?");
                                System.out.println("1.haa");
                                System.out.println("2.maya");
                                int dooroo=input.nextInt();
                                if (dooroo==1){
                                    System.out.println("wad ku guuleysatay in aad ugu shubtid $" + lacagt2 + " ");

                                }else{
                                    System.out.println("mahadsanid");
                                }


                            }else if (dooro5==2){
                                System.out.println("fadlan gali lacagta ");
                                int lacag=input.nextInt();
                                System.out.println("mahubtaa in aad ku shubtid $" + lacag + "?");
                                System.out.println("1.haa");
                                System.out.println("2.mya");
                                int doooro=input.nextInt();
                                if (doooro==1) {
                                    System.out.println("wad ku guuleysatay in aad ku shubtid $" + lacag + " ");
                                }else{
                                    System.out.println("mahadsanid");
                                }

                            }else if (dooro5==3){
                                System.out.println("fadlan gali lacagta ");
                                int lacag=input.nextInt();
                                System.out.println("mahubtaa in aad ku shubtid $" + lacag + "?" );
                                System.out.println("1.haa");
                                System.out.println("2.mya");
                                int dro=input.nextInt();
                                if (dro==1) {
                                    System.out.println("wad ku guuleysatay in aad ku shubtid $" + lacag + " " );
                                }else{
                                    System.out.println("mahadsanid");
                                }

                            }else if (dooro5==4){
                                System.out.println("fadlan gali lacagta ");
                                int lacag=input.nextInt();
                                System.out.println("mahubtaa in aad ku shubtid $" + lacag + "?" );
                                System.out.println("1.haa");
                                System.out.println("2.mya");
                                int dro=input.nextInt();
                                if (dro==1) {
                                    System.out.println("wad ku guuleysatay in aad ku shubtid $" + lacag + " " );
                                }else{
                                    System.out.println("mahadsanid");
                                }

                            }else if (dooro5==5){
                                System.out.println("fadlan gali lacagta ");
                                int lacag=input.nextInt();
                                System.out.println("mahubtaa in aad ku shubtid $" + lacag + "?" );
                                System.out.println("1.haa");
                                System.out.println("2.mya");
                                int doro=input.nextInt();

                                if (doro==1) {
                                    System.out.println("wad ku guuleysatay in aad ku shubtid $" + lacag + " " );
                                }else{
                                    System.out.println("mahadsanid");
                                }

                            }

                        }else if (dooro==5){
                            System.out.println("fadlan gali Mobilka");
                            int mobil=input.nextInt();
                            System.out.println("fadlan gali lacagta");
                            int lcagt=input.nextInt();
                            System.out.println("ma hubtaa in aad ku shubtid $" + lcagt + "?" );
                            System.out.println("1.haa");
                            System.out.println("2.mya");
                            int doro=input.nextInt();

                            if (doro==1) {
                                System.out.println("wad ku guuleysatay in aad ku shubtid $" + lcagt + " " );
                            }else{
                                System.out.println("mahadsanid");
                            }

                        }
//qeybtan waa qeybta billka
                    }else if (doorasho==3){
                        System.out.println("Bixi Bill");
                        System.out.println("1.Post Paid");
                        System.out.println("2.ku iibso");
                        int dro20=input.nextInt();
                        if (dro20==1){
                            System.out.println("Post paid");
                            System.out.println("1.ogow Billka");
                            System.out.println("2.Bixi Bill");
                            System.out.println("3.ka Bxi Bill ");
                        }else if (dro20==2){
                            System.out.println("fadlan gali aqoonsiga Ganacsiga");
                            String aqoonsiga=input.next();
                        }
                    }else if (doorasho==4){
                        System.out.println("fadlan gali mobilka");
                        int mobi=input.nextInt();
                        System.out.println("Fadlan gali lacagta");
                        int lcg=input.nextInt();
                        System.out.println("ma hubtaa in aad udirtid $" + lcg + "?" );
                        System.out.println("1.haa");
                        System.out.println("2.maya");
                        int doro=input.nextInt();
                        if (doro==1) {
                            System.out.println("wad ku guuleysatay in aad u dirtid $" + lcg + " " );
                        }else{
                            System.out.println("mahadsanid");
                        }


                    }else if (doorasho==5){
                        System.out.println("Warbxin Kooban");
                        System.out.println("1.last Action");
                        System.out.println("2.Wareejintii ");
                        System.out.println("3.iibsashadii udanbeesay");
                        System.out.println("4.Last 3 Actions");
                        System.out.println("5.Email Me My Activity");
                        int reportchoice=input.nextInt();

                        if (reportchoice==1) {
                            System.out.println("Waxaa ugu dambeeyay aad ku shubtid 20$");
                        }else if (reportchoice==2) {
                            System.out.println("Waxaad wareegisay lacag dhan 1500$ bishi lasoo dhaafay");
                        }else if (reportchoice==3) {
                            System.out.println("Waxaad ugu dambeysay ku shubasho $5 Airtime");
                        }else if (reportchoice==4){
                            System.out.println("1. $5 ugu shubtay 615223443. $200 u wareejisay 615123456. $3 ku shubatay internet.");
                        }else if (reportchoice==5)
                            System.out.println("Waxaan kuu dirnay warbixinta email-kaaga: salaharab@gmail.com");


                    }else if (doorasho==6){
                        System.out.println("Salaam Bank");
                        System.out.println("1.itus Haraaga");
                        System.out.println("2.lacag dhigato");
                        System.out.println("3.lacag qaadasho");
                        System.out.println("4.Ka wareeji EVC Plus");
                        int bankChoice = input.nextInt();

                        if (bankChoice==1) {
                            System.out.println("Haraagaaga waa 5000$");
                        }else if (bankChoice==2) {
                            System.out.println("Fadlan gali lacagta aad rabto in aad dhigato");
                            int deposit=input.nextInt();
                            System.out.println("Ma hubtaa inaad dhigato $" + deposit + "?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int confirm = input.nextInt();
                            if (confirm==1)
                                System.out.println("Waxaad si guul leh u dhigtay $ "+ deposit + " ?" );
                            else
                                System.out.println("Mahadsanid");
                        }else if (bankChoice==3) {
                            System.out.println("Fadlan geli lacagta aad rabto inaad ka qaadato:");
                            int withdraw = input.nextInt();
                            System.out.println("Ma hubtaa inaad ka qaadato $" + withdraw + "?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int confirm = input.nextInt();
                            if (confirm==1)
                                System.out.println("Waxaad si guul leh uga qaaday $"+ withdraw + " " );

                            else
                                System.out.println("Mahadsanid");
                        }else if (bankChoice==4){
                            System.out.println("Fadlan geli lacagta aad rabto inaad kala baxdo EVC Plus kuna wareejiso Salaam Bank:");
                            int transfer = input.nextInt();
                            System.out.println("Ma hubtaa inaad wareejiso $" + transfer + "?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int confirm = input.nextInt();
                            if (confirm==1)
                                System.out.println("Waxaad si guul leh uga wareejisay $ "+ transfer +  "");
                            else
                                System.out.println("mahdsanid");

                        }





                    }else if (doorasho==7){
                        System.out.println("Maareynta");
                        System.out.println("1. Bedel lambarka sirta (PIN)");
                        System.out.println("2. Bedel luqadda");
                        System.out.println("3. Wargelin Mobile lumay");
                        System.out.println("4. Xir lacagta (Account Lock)");
                        System.out.println("5. U celi lacag qalad ku baxday");
                        int maareyn = input.nextInt();

                        if (maareyn == 1){
                            System.out.println("Fadlan gali PIN-kii hore:");
                            int oldPin = input.nextInt();
                            if (oldPin == 1234){
                                System.out.println("Fadlan gali PIN cusub:");
                                int newPin = input.nextInt();
                                if (String.valueOf(newPin).length() == 4){
                                    System.out.println("PIN-kaaga waad   bedelay!");
                                    }else{
                                    System.out.println("PIN-ka cusub waa inuu ahaadaa 4-lambar.");
                                }
                            }else{
                                System.out.println("PIN-kii hore waa khalad.");
                            }
                        }else if (maareyn == 2){
                            System.out.println("Dooro Luqadda:");
                            System.out.println("1. Af-Soomaali");
                            System.out.println("2. English");
                            int luqad = input.nextInt();
                            if (luqad == 1){
                                System.out.println("Language English: Af-Soomaali");
                            }else if (luqad == 2){
                                System.out.println("Language Afsomali to: English");
                            }else{
                                System.out.println("Doorasho khaldan.");
                            }
                        }else if (maareyn == 3){
                            System.out.println("Fadlan geli lambarka mobilka lumay:");
                            String number = input.next();
                            System.out.println("Wargelin ayaa la diray oo sheegaysa in " + number + " ");
                        }else if (maareyn == 4){
                            System.out.println("Ma hubtaa inaad rabto inaad xirtid account-kaaga?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int confirm = input.nextInt();
                            if (confirm == 1){
                                System.out.println("Account-kaaga si ku meel gaar ah ayaa loo xiray.");
                            }else{
                                System.out.println("Lama xirin. Mahadsanid.");
                            }

                        }else if (maareyn == 5){
                            System.out.println("Fadlan geli lambarka aad qalad ugu dirtay:");
                            String qaladNumber = input.next();
                            System.out.println("Geli lacagta aad u dirtay qalad:");
                            int amount = input.nextInt();
                            System.out.println("Ma rabtaa inaad codsato in lagu soo celiyo $" + amount + " oo aad u dirtay " + qaladNumber + "?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int confirm = input.nextInt();
                            if (confirm == 1){
                                System.out.println("Codsiga celinta lacagta waa la diray. Sug jawaabta adeegga.");
                            }else{
                                System.out.println("Mahadsanid, waxba lama qaban.");
                            }
                        }else{
                            System.out.println("Doorasho khaldan. Fadlan dooro 1 ilaa 5.");
                        }
                    }

                    else if (doorasho==8){
                        System.out.println("EVC Plus");
                        System.out.println("1.Itus Hargaaga Bill ka");
                        System.out.println("2.Wada Bixi Bill-ka");
                        System.out.println("3.Qeyb ka Bixi Bill-ka");
                        int dooro9=input.nextInt();

                        if (dooro9==1){
                            System.out.println("Haraaga Biilka waa $5000");
                        }else if (dooro9==2) {
                            System.out.println("Bill-ka oo dhameystiran ayaa lagu leeyahay $320");
                            System.out.println("Ma rabtaa inaad wada bixiso?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int confirm = input.nextInt();
                            if (confirm == 1){
                                System.out.println("Waad ku guuleysatay inaad bixiso bill-ka oo dhan ($3200)");
                            }else {
                                System.out.println("Mahdsanid,waxba Lama bixin");
                            }
                        }else if (dooro9==3) {
                            System.out.println("Fadlan geli lacagta aad rabto inaad ka bixiso bill-ka:");
                            int qeyb = input.nextInt();

                            if (qeyb > 0 && qeyb <= 3200) {
                                System.out.println("Ma hubtaa inaad bixiso $" + qeyb + "?");
                                System.out.println("1. Haa");
                                System.out.println("2. Maya");
                                int confirm = input.nextInt();
                                if (confirm == 1) {
                                    System.out.println("Waad bixisay $" + qeyb + " ");
                                }else {
                                    System.out.println("mahadsanid waxba lama bixin");
                                }

                            }
                            }
                    }
            }else {
                System.out.println("Pin ka waa qalad");
            }

            }else{
            System.out.println("Code ka Waa qalad");
        }


    }
}