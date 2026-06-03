# 📊 Tableau Analytics Portal

A modern Spring Boot web application for managing and viewing Tableau Public dashboards from a centralized configuration repository.

The application dynamically loads dashboard metadata from a GitHub-hosted JSON file and displays interactive Tableau visualizations through a responsive and user-friendly interface.

---

## 🚀 Features

### Dashboard Management

- Dynamic dashboard loading from GitHub JSON
- Centralized dashboard configuration
- No code changes required when adding new dashboards
- Multiple dashboard support
- Category-based organization

### User Experience

- Modern responsive UI
- Dashboard selection dropdown
- Dynamic theme switching
- Interactive Tableau embedding
- Mobile-friendly design
- Real-time dashboard loading

### Integrations

- Tableau Public
- GitHub
- Spring Boot
- Thymeleaf
- Jackson JSON Processing

---

## 🏗️ Architecture

```text
┌────────────────────┐
│  Tableau Public    │
└─────────┬──────────┘
          │
          ▼
┌────────────────────┐
│ Dashboard URLs     │
│ Stored in GitHub   │
└─────────┬──────────┘
          │
          ▼
┌────────────────────┐
│ Spring Boot App    │
└─────────┬──────────┘
          │
          ▼
┌────────────────────┐
│ Dashboard Service  │
└─────────┬──────────┘
          │
          ▼
┌────────────────────┐
│ Thymeleaf Frontend │
└─────────┬──────────┘
          │
          ▼
┌────────────────────┐
│ User Dashboard     │
│ Experience         │
└────────────────────┘
```

---

## 🔄 Application Workflow

### High-Level Flow

```text
┌─────────────────────┐
│ Create Dashboard    │
│ in Tableau Public   │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ Publish Dashboard   │
│ to Tableau Public   │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ Copy Dashboard URL  │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────────────┐
│ Update dashboards.json      │
│ in GitHub Repository        │
└──────────┬──────────────────┘
           │
           ▼
┌─────────────────────┐
│ Push Changes        │
│ to GitHub           │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ Spring Boot Starts  │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ DashboardService    │
│ Reads JSON File     │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ Jackson Converts    │
│ JSON to Objects     │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ Controller Sends    │
│ Data to Frontend    │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ Thymeleaf Renders   │
│ Dashboard List      │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ User Selects        │
│ Dashboard           │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ Tableau Dashboard   │
│ Loads Dynamically   │
└─────────────────────┘
```

---

## 📖 How It Works

### Step 1: Dashboard Creation

Create visualizations and dashboards using Tableau Public.

### Step 2: Dashboard Publishing

Publish dashboards to Tableau Public and obtain a public dashboard URL.

Example:

```text
https://public.tableau.com/views/SalesDashboard/Dashboard1?:showVizHome=no
```

### Step 3: Configuration Management

Store dashboard metadata in a GitHub-hosted JSON file.

Example:

```json
{
  "title": "Sales Dashboard",
  "category": "Sales",
  "description": "Sales Performance Dashboard",
  "url": "https://public.tableau.com/views/SalesDashboard/Dashboard1?:showVizHome=no"
}
```

### Step 4: Dynamic Data Retrieval

The application downloads dashboard metadata directly from GitHub.

### Step 5: Data Processing

Jackson converts JSON data into Java objects.

```java
List<Dashboard>
```

### Step 6: MVC Processing

The Controller receives dashboard information from the Service Layer and passes it to the View Layer.

### Step 7: Frontend Rendering

Thymeleaf dynamically renders dashboard information.

### Step 8: User Interaction

Users select dashboards using a dropdown interface.

### Step 9: Dynamic Loading

Selected Tableau dashboards are loaded dynamically using Tableau's Embedding API.

### Step 10: Theme Customization

The application changes themes automatically based on dashboard category.

---

## 📂 Project Structure

```text
tableauportal
│
├── src
│   │
│   ├── main
│   │   │
│   │   ├── java
│   │   │   │
│   │   │   └── com
│   │   │       └── parthiv
│   │   │           └── tableauportal
│   │   │               │
│   │   │               ├── controller
│   │   │               │   └── DashboardController.java
│   │   │               │
│   │   │               ├── model
│   │   │               │   └── Dashboard.java
│   │   │               │
│   │   │               ├── service
│   │   │               │   └── DashboardService.java
│   │   │               │
│   │   │               └── TableauportalApplication.java
│   │   │
│   │   └── resources
│   │       │
│   │       ├── templates
│   │       │   └── index.html
│   │       │
│   │       └── application.properties
│
├── pom.xml
├── mvnw
├── mvnw.cmd
├── .gitignore
└── README.md
```

---

## ⚙️ Technology Stack

| Technology | Purpose |
|------------|----------|
| Java 21 | Backend Development |
| Spring Boot | Application Framework |
| Thymeleaf | Server-Side Rendering |
| Maven | Dependency Management |
| Tableau Public | Data Visualization |
| GitHub | Dashboard Configuration Storage |
| Jackson | JSON Processing |

---

## 📄 Dashboard Configuration

The application uses a centralized JSON configuration file.

Example:

```json
[
  {
    "title": "Sales Dashboard",
    "category": "Sales",
    "description": "Monthly Sales Analytics",
    "url": "https://public.tableau.com/views/SalesDashboard/Dashboard1?:showVizHome=no"
  }
]
```

---

## ▶️ Running the Application

### Clone Repository

```bash
git clone https://github.com/Parthiv-2003/tableauportal.git
cd tableauportal
```

### Run Application

Linux / Git Bash

```bash
./mvnw spring-boot:run
```

Windows

```cmd
mvnw.cmd spring-boot:run
```

### Open Browser

```text
http://localhost:8081
```

---

## 🌐 Deployment Options

The application can be deployed to:

- :contentReference[oaicite:0]{index=0}
- :contentReference[oaicite:1]{index=1}
- :contentReference[oaicite:2]{index=2}
- :contentReference[oaicite:3]{index=3}
- :contentReference[oaicite:4]{index=4}

---

## 🎯 Future Enhancements

- Authentication & Authorization
- Dashboard Search
- Dashboard Favorites
- Usage Analytics
- Role-Based Access Control
- Dashboard Tags
- Dark Mode
- Dashboard Categories Filter
- Admin Management Panel
- REST API Support

---

## 💡 Use Cases

- Business Intelligence Portal
- Analytics Dashboard Hub
- Tableau Portfolio Showcase
- Enterprise Dashboard Catalog
- Internal Reporting Platform
- Personal Data Analytics Repository

---

## 📄 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

### Parthiv Tandel

Computer Science Graduate | Java Developer | Data Analytics Enthusiast

GitHub: :contentReference[oaicite:5]{index=5}

---

## ⭐ Support

If you found this project useful:

- Star the repository
- Fork the project
- Submit feature requests
- Create issues
- Contribute improvements

---

## 🎉 Project Goal

The goal of this project is to simplify Tableau dashboard management by separating dashboard configuration from application code, enabling users to manage visualizations directly from GitHub without modifying or redeploying the Spring Boot application.

---

Built with ❤️ using Spring Boot, Thymeleaf, GitHub, and Tableau Public.
