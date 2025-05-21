# Berthier UI Automation Framework

📌 Тренировочный UI-автоматизационный фреймворк на Java с использованием Playwright и JUnit 5.  
Проект разработан для демонстрации навыков работы с пользовательским интерфейсом веб-приложений.

Целевой сайт для тестов — [demoqa.com](https://demoqa.com)

---

## 🛠 Стек технологий

- ☕ **Java 11+**
- 🧪 **JUnit 5** — тестовый фреймворк
- 🎭 **Playwright for Java** — библиотека UI-автоматизации
- 📦 **Maven** — управление зависимостями и сборкой
- ✅ (в будущем) **Allure** — отчёты о тестах
- ☁ (опционально) **GitHub Actions** — CI

---

## 🔍 Что покрывает проект

Проект покрывает наиболее распространённые элементы веб-интерфейса:

### 🔹 Компоненты и действия:
- Form inputs (текст, даты, чекбоксы, радиокнопки)
- Alerts, модальные окна, окна подтверждения
- Drag & drop, клики, двойные клики
- Элементы таблиц, виджеты (datepicker, sliders)
- Работа с фреймами, окнами, вкладками
- Навигация по страницам и компонентам

### 🔹 Разделы сайта [demoqa.com](https://demoqa.com), используемые в тестах:
- Elements (Buttons, Check Box, Web Tables)
- Forms (Text Box, Practice Form)
- Alerts, Frame & Windows
- Widgets (Slider, Progress Bar, Tool Tips)
- Interactions (Droppable, Sortable)
- Book Store Application (авторизация, добавление книг)

---

## 🚀 Как запустить

1. Установи JDK 11+ и Maven.
2. Клонируй проект:

```bash
git clone https://github.com/твоеимя/berthier-ui-framework.git
cd berthier-ui-framework

```
3. Установи браузеры Playwright:

```bash
mvn exec:java -e -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"
```

4. Запусти тесты:
```bash
mvn test
```

---
## 📁 Структура проекта

```bash
src/
├── main/java/
│   └── utils/          → вспомогательные классы
└── test/java/
├── base/           → BaseTest, инициализация Playwright
├── pages/          → Page Object модели
├── tests/          → UI-тесты
└── data/           → Тестовые данные (опционально)
```
---
## 🔧 Планы развития
- Добавить Allure-отчёты 
- Разделить тесты по модулям (формы, алерты, таблицы и т.д.)
- Параметризация и внешние конфиги 
- Mультибраузерная поддержка (Firefox, WebKit)
- CI-интеграция через GitHub Actions
---


