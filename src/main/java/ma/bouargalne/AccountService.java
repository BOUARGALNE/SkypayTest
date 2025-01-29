package ma.bouargalne;


public interface AccountService {
    void desposit(int amount);
    void withdraw(int amount);
    void printStatement();
}
