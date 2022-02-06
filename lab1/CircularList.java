
public class CircularList{
    public int[]list = new int[0];
    public int size(){
        return this.list.length;
    }
    public void add(int element){
        int currentSize = this.size();
        boolean check = false;
        int[]newList = new int[currentSize+1];
        for(int i = 0; i < currentSize; i++){
            if(this.list[i] != element){
                newList[i] = this.list[i];
            }else{
                check = true;
            }
        }
        if(!check){
            newList[currentSize] = element;
            this.list = newList;
        }
    }
    public int get(int index)
    {
        int currentSize = this.size();
        if(index < 0){
            index = index + currentSize;
        }
        if(index >= currentSize){
            index = index - currentSize;
        } 
    
        return this.list[index];
    }
    public double average(){
        double sum = 0;
        for(int i = 0; i < this.size(); i++){
            sum = sum + this.get(i);
        }
        return sum/this.size();
    }
    public int max(){
        int max = this.get(0);
        for(int i = 0; i < this.size(); i++){
            if(max < this.get(i)){
                max = this.get(i);

            }
        }
        return max;
    }
    public int min(){
        int min = this.get(0);
        for(int i = 0; i < this.size(); i++){
            if(min > this.get(i)){
                min = this.get(i);
            }
        }
        return min;
    }
    public int getMinIndex(int min){
        int index = 0;
        for(int i = 0; i < this.size(); i++){
            if(min == this.get(i)){
                index = i;
                break;
            }
        }
        return index;
    }
}
