/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SRP;

/**
 *
 * @author ARGOM
 */
public class SRP {

    public static void main(String[] args) {
        User user = new User("Alice", "alice@example.com");
        UserRepository userRepository = new UserRepository();
        EmailService emailService = new EmailService();

        userRepository.saveUser(user);
        emailService.sendEmail(user);
    }
}