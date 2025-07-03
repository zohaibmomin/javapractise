

```markdown
# 📄 Log Watcher – Real-Time Log Monitoring with Spring Boot

This project is a **real-time log viewer** built using **Spring Boot**, **WebSocket**, and **Vanilla JavaScript**. It watches a log file (`log.txt` by default) and streams any new lines to all connected browser clients instantly. It also displays the **last 10 lines** when the page loads.

---

## 🚀 Features

- ✅ Real-time log streaming via WebSocket
- 📜 Initial fetch of last 10 log lines on load
- 🧪 JUnit test to verify tail logic
- 🧹 Clean, testable, modular Spring Boot design
- 🌐 HTML frontend with `SockJS` and `STOMP`

---

## 🛠️ Tech Stack

| Layer       | Tech Used                    |
|------------|------------------------------|
| Backend     | Spring Boot, WebSocket (STOMP) |
| Frontend    | HTML, JavaScript, STOMP.js, SockJS |
| Testing     | JUnit 5, Mockito             |
| Build Tool  | Maven                        |
| Java Version| Java 21                      |

---

## 📂 Project Structure

```

log-watcher-fullstack/
├── src/
│   ├── main/
│   │   ├── java/com/example/logwatcher/
│   │   │   ├── LogWatcherApplication.java      # Main entry point
│   │   │   ├── controller/LogController.java   # REST endpoint to get last 10 lines
│   │   │   ├── service/LogTailService.java     # Core logic to tail file and push updates
│   │   │   └── config/WebSocketConfig.java     # STOMP/WebSocket configuration
│   │   └── resources/static/log.html           # HTML + JS frontend
│   └── test/java/com/example/logwatcher/
│       └── service/LogTailServiceTest.java     # JUnit test for log tailing logic
└── pom.xml                                     # Maven config

````

---

## ▶️ Running the Application

### Prerequisites

- Java 21+
- Maven

### Steps

1. **Clone the repo**

   ```bash
   git clone https://github.com/your-username/log-watcher-fullstack.git
   cd log-watcher-fullstack
````

2. **Run the app**

   ```bash
   ./mvnw spring-boot:run
   ```

3. **Open in browser**

   Navigate to: [http://localhost:8080/log.html](http://localhost:8080/log.html)

4. **Try appending to `log.txt`**

   In terminal:

   ```bash
   echo "New log line $(date)" >> log.txt
   ```

   You should see it instantly appear in the browser.

---

## 🧪 Run Tests

```bash
./mvnw test
```

---

## ⚙️ Configuration

You can change the log file path via:

```properties
# src/main/resources/application.properties
log.file.path=/path/to/your/logfile.log
```

---

## 📌 Future Improvements

* Add filtering/search in UI
* Support tailing multiple log files
* UI enhancements (timestamp, auto-coloring errors)

---

## 🤝 License

MIT – free to use, modify, and share.

---

## 👨‍💻 Author

Built by [Zohaib Momin](https://www.linkedin.com/in/zohaib-momin-6346a122/)

```
