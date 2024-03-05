<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST['name'];
    $email = $_POST['email'];
    $subject = $_POST['subject'];
    $message = $_POST['message'];

    // Set up email recipient and subject
    $to = "gsivakrishna007@gmail.com"; // Change this to your email address
    $email_subject = "New Contact Form Submission: $subject";

    // Email content
    $email_body = "You have received a new message from the user $name.\n".
        "Email address: $email\n".
        "Message:\n$message";

    // Headers
    $headers = "From: $email";

    // Send email
    if (mail($to, $email_subject, $email_body, $headers)) {
        echo "Thank you for contacting us. We will get back to you soon!";
    } else {
        echo "Oops! Something went wrong. Please try again later.";
    }
}
?>
