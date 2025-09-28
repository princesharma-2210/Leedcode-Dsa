import speech_recognition as sr
import webbrowser
import pyttsx3

# Initialize text-to-speech engine
engine = pyttsx3.init()

def speak(text):
    engine.say(text)
    engine.runAndWait()

def processCommand(command):
    command = command.lower()
    if "open google" in command:
        speak("Opening Google")
        webbrowser.open("https://google.com")
    elif "open facebook" in command:
        speak("Opening Facebook")
        webbrowser.open("https://facebook.com")
    elif "open youtube" in command:
        speak("Opening YouTube")
        webbrowser.open("https://youtube.com")
    elif "open linkedin" in command:
        speak("Opening LinkedIn")
        webbrowser.open("https://linkedin.com")
    else:
        speak("Sorry, I didn't understand that command.")

if __name__ == "__main__":
    speak("Initializing Jarvis...")

    # Create a recognizer instance once
    r = sr.Recognizer()

    while True:
        try:
            with sr.Microphone() as source:
                r.adjust_for_ambient_noise(source, duration=0.5)
                print("Listening for wake word 'Jarvis'...")
                audio = r.listen(source, timeout=2, phrase_time_limit=1)

            wake_word = r.recognize_google(audio)
            print("Heard:", wake_word)

            if wake_word.lower() == "jarvis":
                speak("Yes?")
                print("Jarvis is active...")

                with sr.Microphone() as source:
                    r.adjust_for_ambient_noise(source, duration=0.5)
                    print("Listening for command...")
                    audio = r.listen(source, timeout=2, phrase_time_limit=1)

                command = r.recognize_google(audio)
                print("Command:", command)
                processCommand(command)

        except sr.UnknownValueError:
            print("Could not understand audio.")
        except sr.RequestError as e:
            print(f"Could not request results from Google Speech Recognition service; {e}")
        except sr.WaitTimeoutError:
            print("Listening timed out while waiting for phrase.")
