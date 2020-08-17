/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.pass.generate;

import com.bcarsoft.pass.model.Pass;

/**
 * This Class is for Generate a Password.
 * @author abelbcarvalho
 */
public class Generate extends AbsGenerate implements IGenerate {

    /**
     * Builder Method.
     */
    public Generate() {
        super();
    }

    /**
     * This method is for generating password, it receives data from the 
     * user and work to generate a new password.
     * @param pass Pass Object
     */
    @Override
    public void managingPassInfo(Pass pass) {
        // clean all
        this.cleanAll();
        // validating data
        this.sedingInformation(pass);
        // verify no success.
        if (!this.isAllow()) {
            // if wasn't success, stop
            return;
        }
        // setting value of selected item by user
        this.howManyChoosePass();
        // resetando allow
        this.setAllow(false);
        // it verifies number that was choosen by user
        switch (this.getItem()) {
            case 1:
                // just a option to characters generation
                this.oneArgument();
                break;
            case 2:
                // two options to characters generation
                this.twoArgument();
                break;
            case 3:
                // three options to characters generation
                this.threeArgument();
                break;
            case 4:
                // four (all) the avaliable options
                this.fourArgument();
                break;
            default:
                break;
        }
    }
    
    /**
     * This method returns the generated password.
     * @return String - the password that was generated.
     */
    @Override
    public String getPasswordGenerate() {
        if (this.isAllow()) {
            return this.getPassword();
        }
        this.cleanAll();
        return this.getPassword();
    }
    
    /**
     * When user choose four (ALL) arguments to generate a new Password.
     */
    private void fourArgument() {
        int aux; // auxiliary variable
        while (this.getPassword().length() < this.getSize()) {
            aux = 1+this.getRad().nextInt(4);
            if (aux == this.getRandom()) {
                // go back to the header loop and run again if allowed
                continue;
            }
            this.setRandom(aux);
            switch (this.getRandom()) {
                case 1:
                    // set upcase letter
                    this.onlyUpCaseChar();
                    break;
                case 2:
                    // set lowcase letter
                    this.onlyLowCaseChar();
                    break;
                case 3:
                    // set number
                    this.onlyNumberChar();
                    break;
                case 4:
                    // set symbol
                    this.onlySymbolChar();
                    break;
                default:
                    break;
            }
        }
        this.setAllow(true);
    }
    
    /**
     * When user chooses three arguments to generate a new Password.
     */
    private void threeArgument() {
        int aux; // auxiliary variable
        if (this.isUpcase() && this.isLowcase() && this.isNumber()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(3);
                if (aux == this.getRandom()) {
                    // go back to the header loop and run again if allowed
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        // set upcase letter
                        this.onlyUpCaseChar();
                        break;
                    case 2:
                        // set lowcase letter
                        this.onlyLowCaseChar();
                        break;
                    case 3:
                        // set number letter
                        this.onlyNumberChar();
                        break;
                    default:
                        break;
                }
            }
        }
        else if (this.isUpcase() && this.isLowcase() && this.isSymbol()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(3);
                if (aux == this.getRandom()) {
                    // go back to the header loop and run again if allowed
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        // set upcase letter
                        this.onlyUpCaseChar();
                        break;
                    case 2:
                        // set lowcase letter
                        this.onlyLowCaseChar();
                        break;
                    case 3:
                        // set symbol
                        this.onlySymbolChar();
                        break;
                    default:
                        break;
                }
            }
        }
        else if (this.isUpcase() && this.isNumber() && this.isSymbol()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(3);
                if (aux == this.getRandom()) {
                    // go back to the header loop and run again if allowed
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        // set upcase letter
                        this.onlyUpCaseChar();
                        break;
                    case 2:
                        // set number letter
                        this.onlyNumberChar();
                        break;
                    case 3:
                        // set symbol letter
                        this.onlySymbolChar();
                        break;
                    default:
                        break;
                }
            }
        }
        else if (this.isLowcase() && this.isNumber() && this.isSymbol()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(3);
                if (aux == this.getRandom()) {
                    // go back to the header loop and run again if allowed
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        // set lowcase letter
                        this.onlyLowCaseChar();
                        break;
                    case 2:
                        // set number
                        this.onlyNumberChar();
                        break;
                    case 3:
                        // set symbol
                        this.onlySymbolChar();
                        break;
                    default:
                        break;
                }
            }
        }
        this.setAllow(true);
    }
    
    /**
     * When user chooses two arguments to generate a new Password.
     */
    private void twoArgument() {
        int aux; // variável auxiliar
        if (this.isUpcase() && this.isLowcase()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(2);
                if (aux == this.getRandom()) {
                    // go back to the header loop and run again if allowed
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        // set upcase letter
                        this.onlyUpCaseChar();
                        break;
                    case 2:
                        // set lowcase letter
                        this.onlyLowCaseChar();
                        break;
                    default:
                        break;
                }
            }
        }
        else if (this.isUpcase() && this.isNumber()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(2);
                if (aux == this.getRandom()) {
                    // go back to the header loop and run again if allowed
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        // set upcase letter
                        this.onlyUpCaseChar();
                        break;
                    case 2:
                        // set number
                        this.onlyNumberChar();
                        break;
                    default:
                        break;
                }
            }
        }
        else if (this.isUpcase() && this.isSymbol()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(2);
                if (aux == this.getRandom()) {
                    // go back to the header loop and run again if allowed
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        // set upcase letter
                        this.onlyUpCaseChar();
                        break;
                    case 2:
                        // set symbol
                        this.onlySymbolChar();
                        break;
                    default:
                        break;
                }
            }
        }
        else if (this.isLowcase() && this.isNumber()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(2);
                if (aux == this.getRandom()) {
                    // go back to the header loop and run again if allowed
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        // set lowcase letter
                        this.onlyLowCaseChar();
                        break;
                    case 2:
                        // set number
                        this.onlyNumberChar();
                        break;
                    default:
                        break;
                }
            }
        }
        else if (this.isLowcase() && this.isSymbol()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(2);
                if (aux == this.getRandom()) {
                    // go back to the header loop and run again if allowed
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        // set lowcase letter
                        this.onlyLowCaseChar();
                        break;
                    case 2:
                        // set symbol letter
                        this.onlySymbolChar();
                        break;
                    default:
                        break;
                }
            }
        }
        else if (this.isNumber() && this.isSymbol()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(2);
                if (aux == this.getRandom()) {
                    // go back to the header loop and run again if allowed
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        // set number
                        this.onlyNumberChar();
                        break;
                    case 2:
                        // set symbol
                        this.onlySymbolChar();
                        break;
                    default:
                        break;
                }
            }
        }
        this.setAllow(true);
    }
    
    /**
     * When user chooses just one argument to generate a new Password.
     */
    private void oneArgument() {
        if (this.isUpcase()) {
            while (this.getPassword().length() < this.getSize()) {
                // set upcase letter
                this.onlyUpCaseChar();
            }
        } else if (this.isLowcase()) {
            while (this.getPassword().length() < this.getSize()) {
                // set lowcase letter
                this.onlyLowCaseChar();
            }
        } else if (this.isNumber()) {
            while (this.getPassword().length() < this.getSize()) {
                // set number
                this.onlyNumberChar();
            }
        } else if (this.isSymbol()) {
            while (this.getPassword().length() < this.getSize()) {
                // set symbol
                this.onlySymbolChar();
            }
        }
        this.setAllow(true);
    }
    
    /**
     * This method is for auxiliary to generate characters.
     * @param a Integer - represents the initial value. 
     * @param b Integer - represents the interview.
     */
    private void useAndInsertDataToGenerateCharacter(int a, int b) {
        this.setInit(a);
        this.setFinish(b);
        this.setPassword(this.getPassword() + this.characterGenerator());
    }
    
    /**
     * Generate and insert only one character of UPCASE each time.
     */
    private void onlyUpCaseChar() {
        // upcase letters
        this.useAndInsertDataToGenerateCharacter(65, 26);
    }
    
    /**
     * Generate and insert only one character of LOWCASE each time.
     */
    private void onlyLowCaseChar() {
        // lowcase letters
        this.useAndInsertDataToGenerateCharacter(97, 26);
    }
    
    /**
     * Generate and insert only one character of Number each time.
     */
    private void onlyNumberChar() {
        // numbers
        this.useAndInsertDataToGenerateCharacter(48, 10);
    }
    
    /**
     * Generate and insert only one character of Symbol each time.
     */
    private void onlySymbolChar() {
        this.setRandom(1+this.getRad().nextInt(4));
        switch (this.getRandom()) {
            case 1:
                // symbol 1
                this.useAndInsertDataToGenerateCharacter(33, 15);
                break;
            case 2:
                // symbol 2
                this.useAndInsertDataToGenerateCharacter(58, 7);
                break;
            case 3:
                // symbol 3
                this.useAndInsertDataToGenerateCharacter(91, 6);
                break;
            case 4:
                // symbol 4
                this.useAndInsertDataToGenerateCharacter(123, 4);
                break;
            default:
                break;
        }
    }
    
}
