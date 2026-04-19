# Asansör Simülasyon Sistemi

Bu proje, bir "Kodluyoruz" sigorta firmasının 12 katlı ve 5 asansöre sahip ofisinin simülasyonudur. Nesne Yönelimli Programlama ilkelerinden **Kalıtım, Çok Biçimlilik (Polymorphism), Soyutlama ve Kapsülleme** bir arada ele alınmıştır.

## Sistemin Çalışma Özellikleri:
- Yolcular rastgele numaralarla (`Random` sınıfı) katlarda üretilir ve sistem çalışmaya başlar.
- Saat ('zaman damgası') özelliği sisteme adapte edilmiş, asansör çağrıldığında ve olay gerçekleştiğinde zaman terminale basılır. 
- Toplam 5 adet asansör, tek bir programlayıcı olan `ElevatorController` üzerinden duruma göre (`dispatchElevator()`) tahsis edilir.
- Bir `Button` sınıfı abstract (soyut) tutulup, Çağrı Butonları vb. yapılarda override edilerek **Polimorfizm** sağlanmıştır. Kapsülleme ise Private değişkenler ile elde tutulmuştur.

## Sınıf Diyagramı (UML)

Sistemin bütünsel mimarisi aşağıdaki sınıf şemasında gösterilmektedir:

```mermaid
classDiagram
    class Simulator {
        -List~Floor~ floors
        -List~Elevator~ elevators
        -ElevatorController controller
        -Random randomGenerator
        +logTimeAndEvent(event)
        +triggerRandomPassenger()
    }

    class ElevatorController {
        -List~Elevator~ elevators
        +dispatchElevator(calledFloor, direction) Elevator
    }

    class Elevator {
        -String id
        -int capacity
        -int currentFloor
        -boolean isMoving
        -ControlPanel controlPanel
        -List~Passenger~ passengers
        +displayIndicator()
        +openDoors()
        +closeDoors()
        +addPassenger(passenger) boolean
    }

    class ControlPanel {
        -List~Button~ destinationButtons
        -Button openDoorButton
        -Button closeDoorButton
        -Button emergencyButton
        +pressDestinationButton(floorIndex)
    }

    class Floor {
        -int floorNumber
        -CallButton upButton
        -CallButton downButton
        +ringArrivalBell()
        +showDirectionLight(direction)
    }

    class Button {
        <<abstract>>
        -boolean isPressed
        +press()*
    }

    class CallButton {
        -String direction
        +press()
    }

    class Passenger {
        -int startFloor
        -int destinationFloor
    }

    %% Kalıtım ve Birliktelik
    Button <|-- CallButton
    
    Simulator o-- "many" Floor : İçerir
    Simulator o-- "many" Elevator : İçerir
    Simulator o-- "1" ElevatorController : Kullanır
    
    ElevatorController --> "many" Elevator : Yönetir
    Elevator *-- "1" ControlPanel : Sahiptir (Composition)
    Elevator o-- "many" Passenger : Taşır
    
    ControlPanel *-- "many" Button : İçerir
    Floor *-- "many" CallButton : Sahiptir
```
