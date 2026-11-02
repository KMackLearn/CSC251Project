public class Policy
{
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private int height;
   private int weight;
   
   public Policy()
   {
      int policyNumber = 0;
      String providerName = "";
      String firstName = "";
      String lastName = "";
      int age = 0;
      String smokingStatus = "";
      int height = 0;
      int weight = 0;
   }
   
   public Policy(int policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, int height, int weight)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.weight = weight;
      this.height = height;
      this.smokingStatus = smokingStatus;
   }
   
   public void setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }
   
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }
   
   public void setAge(int age)
   {
      this.age = age;
   }
   
   public void setWeight(int weight)
   {
      this.weight = weight;
   }
   
   public void setHeight(int height)
   {
      this.weight = height;
   }
   
   public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }
   
   
   // accessors
   public void getPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }
   
   public void getProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   public void getFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   public void getLastName(String lastName)
   {
      this.lastName = lastName;
   }
   
   public void getAge(int age)
   {
      this.age = age;
   }
   
   public void getWeight(int weight)
   {
      this.weight = weight;
   }
   
   public void getHeight(int height)
   {
      this.weight = height;
   }
   
   public void getSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }
   
   // calculate BMI
   
   public int getBMI()
   {
      final int BMI_FACTOR = 703;
      int bmi = 0;
   
      if (height > 0);
      {
         bmi = (weight * BMI_FACTOR) / (height * height);
      }
   
      return bmi;
   }
   
   public int getPrice()
   {
      final int BASE_FEE = 600;
      final int MAX_AGE_FEE = 75;
      final int AGE_MAX = 50;
      final int SMOKER_FEE = 100;
      final int BMI_MAX = 35;
      final int BMI_RATE = 20;
      
      int price = BASE_FEE;
      
      if (age > AGE_MAX)
      {
         price += MAX_AGE_FEE;
      }
      
      if (smokingStatus.equals("smoker"))
      {
         price += SMOKER_FEE;
      }
      
      int bmi = getBMI();
      if (bmi > BMI_MAX)
      {
         price += (bmi - BMI_MAX) * BMI_RATE;
      }
      
      return price;
   }

}