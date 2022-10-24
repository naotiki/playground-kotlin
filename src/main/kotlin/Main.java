import org.jetbrains.annotations.Nullable;

import static java.lang.System.out;

class main{
    void main(){
        var str=stringIsh();
        if (str!=null){
            str.replace("Hi","Hello");
        }
    }
    @Nullable
    String stringIsh(){
        return null;
    }
}