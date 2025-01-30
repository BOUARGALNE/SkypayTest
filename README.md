# Bank Kata - Gestion de compte bancaire

## 📌 Description
Ce projet est une implémentation d'un kata bancaire simple en Java. Il permet de gérer un compte bancaire avec les fonctionnalités suivantes :
- Dépôt d'argent
- Retrait d'argent
- Impression d'un relevé des transactions

Le développement suit une approche **Test Driven Development (TDD)** avec **JUnit 5**.

## 🛠️ Technologies utilisées
- **Java 17**
- **JUnit 5** (tests unitaires)
- **Maven** (gestion des dépendances et compilation)

## 📂 Structure du projet
```
bank-kata/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── bank/
│   │   │           ├── AccountService.java  # Interface des services bancaires
│   │   │           ├── Account.java         # Implémentation de l'interface
│   │   │           ├── Transaction.java     # Classe pour gérer les transactions
│   ├── test/
│   │   ├── java/
│   │   │   ├── AccountTest.java     # Tests unitaires avec JUnit
│── pom.xml  # Fichier de configuration Maven
│── README.md  # Documentation du projet
```

## 🚀 Installation et Exécution
### 1️⃣ Cloner le dépôt
```sh
git clone https://github.com/BOUARGALNE/SkypayTest.git
cd SkypayTest
```
### 2️⃣ Compiler le projet avec Maven
```sh
mvn compile
```
### 3️⃣ Exécuter les tests
```sh
mvn test
```
### 4️⃣ Exécuter le programme (si une méthode `main` est ajoutée)
```sh
java com.bank.Account
```

## ✅ Fonctionnalités
- Ajouter un dépôt sur le compte bancaire
- Effectuer un retrait
- Afficher l'historique des transactions

## 📝 Exemples d'utilisation
```java
Account account = new Account();
account.desposit(1000);
account.withdraw(500);
account.printStatement();
```
### Sortie attendue :
```
DATE       | TYPE    | AMOUNT | BALANCE
2025-01-30 | DEPOSIT | 1000   | 1000
2025-01-30 | WITHDRAW| 500    | 500
```

## 📜 Licence
Ce projet est sous licence **MIT**. Vous êtes libre de l'utiliser, de le modifier et de le distribuer.

## 📩 Contact
Si vous avez des questions ou des suggestions, n'hésitez pas à me contacter via GitHub ! 🚀

