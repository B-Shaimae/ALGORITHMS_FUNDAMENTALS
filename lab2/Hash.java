public class Hash{

    public String[] key = new String[0];
    public int[] value = new int[0];
    public int size(){
        return this.key.length;
    }
    public void add(String key, String value){
        if(value.length() >= 256){
            System.out.println("value lenght is too big!");
            return;
        }else{
            int currentSize = this.size();
            String[]newkey = new String[currentSize + 1];
            int[]newvalue = new int[currentSize + 1];
            for(int i = 0; i < currentSize; i++){
                newkey[i] = this.key[i];
                newvalue[i] = this.value[i];
            }
            if(!this.contains(key)){
                newkey[currentSize] = key;
                newvalue[currentSize] = this.remainder_sum(value);
                this.key = newkey;
                this.value  = newvalue;
            }
        }
        
    }
    public int get(String key){
        int currentSize = this.size();
        for(int i = 0; i < currentSize; i++){
            if(key == this.key[i]){
                return this.value[i];
            }
        }
        return -1;
    }
    public boolean contains(String key){
        int currentSize = this.size();
        for(int i = 0; i < currentSize; i++){
            if(key.equals(this.key[i])){
                return true;
            }
        }
        return false;
    }
    
    public int modulo(int num, int i){
        int tmp = num;
        while (tmp >= i) {
            tmp -= i;
        }
        return tmp;
    }
    public int remainder_sum(String value){
        int res = 0, count = 0;   
        for(int i = 0; i < value.length(); i++) {    
            if(value.charAt(i) != ' ') 
                count++;    
        }
        for(int i=1; i<= count; i++){
            res += this.modulo(count, i);
        }
        return res;
    }

    @Override
    public String toString(){
        String table = "";
        for(int i=0; i< this.size(); i++){
            table += this.key[i] + " " + this.value[i] + "\n";
        }
        return table;
    }
}
