import { useParams } from "react-router-dom";
import trainersMock from "./trainersMock";

function TrainerDetail() {
    const { id } = useParams();
    const trainer = trainersMock.find((t) => t.trainerId === id);

    if (!trainer) return <p>Trainer not found</p>;

    return (
        <div>
            <h2>Trainers Details</h2>
            <p><strong>{trainer.name} ({trainer.technology})</strong></p>
            <p>{trainer.email}</p>
            <p>{trainer.phone}</p>
            <ul>
                {trainer.skills.map((skill, index) => (
                    <li key={index}>{skill}</li>
                ))}
            </ul>
        </div>
    );
}

export default TrainerDetail;
