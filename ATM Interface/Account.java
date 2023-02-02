// @copyright --- Coded by Dipam Dey, Roll 077

class Account{
	private String name;
	private static int id;
	private double balance;
	private double withdraw;
	private double deposit;
    
	/**
	 * @param name
	 * @param balance
	 * @param withdraw
	 * @param deposit
	 */
	public Account(String name, double balance, double withdraw, double deposit) {
		this.name = name;
		this.balance = balance;
		this.withdraw = withdraw;
		this.deposit = deposit;
	}

    /**
	 * @return the id
	 */
    public int getId(){
        return id;
    }
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
		Account.id++;
	}
	
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @return the withdraw
	 */
	public double getWithdraw() {
		return withdraw;
	}
	/**
	 * @param withdraw the withdraw to set
	 */
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	/**
	 * @return the deposit
	 */
	public double getDeposit() {
		return deposit;
	}
	/**
	 * @param deposit the deposit to set
	 */
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
}
