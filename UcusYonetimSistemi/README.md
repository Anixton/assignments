# Uçuş Yönetim Sistemi

Bu projedeki senaryo, hava yolları, pilotlar, havaalanları ve uçuşlar arasındaki ilişkiyi tasvir etmektedir. Nesne Yönelimli Tasarım (OOD - Object Oriented Design) bakımından **Association (Birliktelik)**, **Aggregation (Toplama)** ve **Composition (Oluşum)** gibi bağlantıları örneklemek için kullanılır.

## Sınıf Diyagramı (UML)

Sistemin çalışma ve birbirleriyle ilişki şeklini aşağıdan inceleyebilirsiniz:

```mermaid
classDiagram
    class Airline {
        -String id
        -String name
        -List~Aircraft~ aircrafts
        -List~Pilot~ pilots
        -List~Flight~ flights
    }
    
    class Aircraft {
        -String id
        -String type
        -State state
        -int requiredPilots
    }
    
    class State {
        <<enumeration>>
        WORKING
        REPAIR
    }

    class Pilot {
        -String id
        -String name
        -String experienceLevel
    }

    class Airport {
        -String id
        -String name
    }

    class Flight {
        -String id
        -LocalDateTime departureTime
        -LocalDateTime arrivalTime
    }

    %% İlişkiler
    Aircraft --> State
    Airline "1" *-- "many" Aircraft : Sahiptir
    Airline "1" o-- "many" Pilot : Bünyesindedir
    Airline "1" *-- "many" Flight : Gerçekleştirir

    Flight "many" --> "1" Airport : departureAirport (Kalkış)
    Flight "many" --> "1" Airport : arrivalAirport (İniş)
    Flight "many" --> "1" Aircraft : assignedAircraft (Kullanır)
    Flight "many" --> "1" Pilot : pilot (Pilot)
    Flight "many" --> "1" Pilot : coPilot (Yardımcı Pilot)
```

## Modelleme Özeti:
1. **Airline (Hava Yolu)** kuruluşu sistemin merkezidir ve **Aircraft (Uçak)**, **Pilot** ile doğrudan ilişkilidir. 
2. **Flight (Uçuş)**, ilişkilerin toplandığı bir Transaction (işlem) sınıfıdır. Hangi uçak, hangi iki **Airport (Havaalanı)** arasında ve kimlerin uçuracağı uçuş nesnesini oluşturur.
3. **Aircraft** sınıfındaki *State* adlı enum (WORKING/REPAIR) ile uçakların arızalı veya çalışır durumda olduğu kolayca takip edilebilir.
