package it.ldc.libridicarta;

/**
 *
 * @author Federico
 */
public enum ImmaginiEnum {
    SI(0),
    NO(1);
    
    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    ImmaginiEnum(int index){
        this.index = index;
    }
    
}
