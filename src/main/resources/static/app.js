const addButton = document.querySelector('.add-patient');
const backdrop = document.querySelector('#backdrop');
const cancel = document.querySelector('#cancel');
const model = document.querySelector('#addmodel');
const togglebackdrop = () => {
    model.classList.toggle('modal-visible');
    backdrop.classList.toggle('visible');
};

addButton.addEventListener('click', togglebackdrop);
cancel.addEventListener('click', togglebackdrop);
backdrop.addEventListener('click', togglebackdrop);
